package com.rcyyd.bookdinner.service;

import java.util.List;

import com.rcyyd.bookdinner.domain.Address;

public interface AddressService {
	boolean addAddress(Address address); //����µ�ַ
	
	boolean deleAddress(int addrid);//ɾ��ָ��id��ŵĶ���
	
	boolean deleAllAaddress(int userid);//��յ�ǰ�û������ж���
	
	boolean updateAddress(Address address);//�޸�ָ��id��Ŷ�������Ϣ
	
	List<Address> getAllAddress();//��ȡ���еĶ���
}
