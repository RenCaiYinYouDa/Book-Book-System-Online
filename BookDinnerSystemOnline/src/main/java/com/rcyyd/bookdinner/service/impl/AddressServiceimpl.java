package com.rcyyd.bookdinner.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcyyd.bookdinner.domain.Address;
import com.rcyyd.bookdinner.persistence.AddressDao;
import com.rcyyd.bookdinner.service.AddressService;
@Service
@Transactional
public class AddressServiceimpl implements AddressService {

	@Autowired
	private  AddressDao addressDao;
	
	/**
	 * ����µĵ�ַ
	 */
	@Override
	public boolean addAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDao.save(address)!=null;		
	}
 
	/**
	 * ɾ��ָ��id��ŵĵ�ַ
	 */
	@Override
	public boolean deleAddress(int addrid) {
		// TODO Auto-generated method stub
		return addressDao.deleteById(addrid);
	}

	/**
	 * ��յ�ǰ�û����еĵ�ַ
	 */
	@Override
	public boolean deleAllAaddress(int userid) {
		// TODO Auto-generated method stub
		return addressDao.deleteById(userid, "userid");
	}

	/**
	 * �޸ĵ�ַ
	 */
	@Override
	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		addressDao.update(address);
		return true;
	}

	/** 
	 * ��ȡ���еĵ�ַ
	 */
	@Override
	public List<Address> getAllAddress(int userid) {
		// TODO Auto-generated method stub
		return addressDao.findByKey(userid, "userid");
	}

}
