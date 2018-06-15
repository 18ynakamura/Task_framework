package jp.co.axiz.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.axiz.web.dao.impl.AdminDao;
import jp.co.axiz.web.entity.Admin;
import jp.co.axiz.web.service.IAdminService;

@Service
@Transactional
public class AdminService implements IAdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
    public Admin authentication(String id, String password) {
    	return adminDao.findByIdAndPassword(id, password);
    }
}
