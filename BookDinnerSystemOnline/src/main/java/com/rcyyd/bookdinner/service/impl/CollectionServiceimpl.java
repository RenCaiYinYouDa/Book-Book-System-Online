package com.rcyyd.bookdinner.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Collection;
import com.rcyyd.bookdinner.persistence.CollectionDao;
import com.rcyyd.bookdinner.service.CollectionService;

@Service
@Transactional
public class CollectionServiceimpl implements CollectionService {
	@Autowired
	protected CollectionDao collectionDao;
	
	@Override
	public boolean save(Collection collection) {
		// TODO Auto-generated method stub
		return collectionDao.save(collection)!=null;
	}

	/**
	 * ɾ��ָ����ŵ��ղ�
	 * @param addrid
	 * @return
	 */
	@Override
	public boolean deleCollection(int addrid) {
		// TODO Auto-generated method stub
		return collectionDao.deleteById(addrid);
	}

	/**
	 * ɾ��ָ���û�usrid�����е��ղ�
	 * @param userid 
	 * @return
	 */
	@Override
	public boolean deleAllCollection(int userid) {
		// TODO Auto-generated method stub
		return collectionDao.deleteById(userid, "userid");
	}

}
