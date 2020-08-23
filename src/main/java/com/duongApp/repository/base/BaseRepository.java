package com.duongApp.repository.base;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

public interface BaseRepository<T> {
	public T findById(final Long identifier);
	public T findById(final Long identifier, Session session);
	public T update(final T detachedInstance);
	public T update(final T detachedInstance, Session session);
	public void delete(final T persistentInstance);
	public void delete(final T persistentInstance, Session session);
	public Object save(final T transientInstance);
	public Object save(final T transientInstance, Session session);
	NativeQuery<?> createSQLQuery(String sql);
}
