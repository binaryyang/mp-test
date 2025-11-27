package edu.neuq.mptest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单主表
 * </p>
 *
 * @author SheepHappy
 * @since 2025-11-27
 */
@Data
@TableName("order_info")
public class OrderInfoDO {
    public static final String TABLE_NAME = "order_info";

    /**
     * 订单主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单编号（业务唯一标识）
     */
    private String orderNo;

    /**
     * 下单用户ID
     */
    private Long userId;

    /**
     * 订单状态：0-待付款 1-待发货 2-待收货 3-已完成 4-已取消
     */
    private Byte orderStatus;

    /**
     * 订单总金额（含所有费用）
     */
    private BigDecimal totalAmount;

    /**
     * 实际支付金额
     */
    private BigDecimal payAmount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
