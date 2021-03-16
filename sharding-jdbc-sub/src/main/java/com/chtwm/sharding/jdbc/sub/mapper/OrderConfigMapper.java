package com.chtwm.sharding.jdbc.sub.mapper;

import com.chtwm.sharding.jdbc.sub.dataobject.OrderConfigDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderConfigMapper {

    OrderConfigDO selectById(@Param("id") Integer id);

}
