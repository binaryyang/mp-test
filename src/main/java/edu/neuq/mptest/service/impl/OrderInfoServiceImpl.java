package edu.neuq.mptest.service.impl;

import edu.neuq.mptest.entity.OrderInfoDO;
import edu.neuq.mptest.mapper.OrderInfoMapper;
import edu.neuq.mptest.service.IOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单主表 服务实现类
 * </p>
 *
 * @author SheepHappy
 * @since 2025-11-27
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfoDO> implements IOrderInfoService {

}
