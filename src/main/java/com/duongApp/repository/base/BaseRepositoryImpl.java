package com.duongApp.repository.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;

public abstract class BaseRepositoryImpl<T> implements BaseRepository<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getSession() {
		return getSessionFactory().getCurrentSession();
	}

	private Class<T> genericType;

	@SuppressWarnings("unchecked")
	public BaseRepositoryImpl() {
		this.genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), BaseRepositoryImpl.class);
	}

	@Override
	public T findById(Long identifier) {
		return (T) this.getSession().get(genericType, identifier);
	}

	@Override
	public T findById(Long identifier, Session session) {
		if (session != null) {
			return (T) session.get(genericType, identifier);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T update(T detachedInstance) {
		return (T) this.getSession().merge(detachedInstance);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T update(T detachedInstance, Session session) {
		if (session != null) {
			return (T) session.merge(detachedInstance);
		}
		return null;
	}

	@Override
	public void delete(T persistentInstance) {
		this.getSession().delete(persistentInstance);
	}
	
	@Override
	public void delete(T persistentInstance, Session session) {
		if (session != null) {
			session.delete(persistentInstance);
		}
	}

	@Override
	public Object save(T transientInstance) {
		return this.getSession().save(transientInstance);
	}
	
	@Override
	public Object save(T transientInstance, Session session) {
		if (session != null) {
			return session.save(transientInstance);
		}
		return null;
	}

	@Override
	public NativeQuery<?> createSQLQuery(String sql) {
		return getSession().createNativeQuery(sql);
	}
}
