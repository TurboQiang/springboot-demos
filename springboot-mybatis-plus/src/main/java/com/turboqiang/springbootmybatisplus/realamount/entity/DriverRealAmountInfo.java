package com.turboqiang.springbootmybatisplus.realamount.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 可提现金额刷入时的流水表
 * </p>
 *
 * @author turboqiang
 * @since 2021-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DriverRealAmountInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 司机id
     */
    private Integer driverId;

    /**
     * 刷入前的可提现金额
     */
    private BigDecimal beforeRealAmount;

    /**
     * 刷入后的可提现金额
     */
    private BigDecimal afterRealAmount;

    /**
     * 刷入金额
     */
    private BigDecimal incrAmount;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
