package ua.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.entity.Commodity;

public interface CommodityDao extends JpaRepository<Commodity, Integer> {

}
