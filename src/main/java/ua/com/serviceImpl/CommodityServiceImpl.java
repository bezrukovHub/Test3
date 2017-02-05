package ua.com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.dao.CommodityDao;
import ua.com.entity.Commodity;
import ua.com.service.CommodityService;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

	
	@Autowired
	private CommodityDao commodityDao;

	public void save(Commodity commodity){
		commodityDao.save(commodity);
	}

	public List<Commodity> findAll() {
		return commodityDao.findAll();
	}

	public Commodity findOne(int id) {
		return commodityDao.findOne(id);
	}

	public void delete(int id) {
		commodityDao.delete(id);
	}

}
