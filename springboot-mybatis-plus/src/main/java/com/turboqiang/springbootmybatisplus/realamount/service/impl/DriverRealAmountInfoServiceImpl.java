package com.turboqiang.springbootmybatisplus.realamount.service.impl;

import com.turboqiang.springbootmybatisplus.realamount.entity.DriverRealAmountInfo;
import com.turboqiang.springbootmybatisplus.realamount.mapper.DriverRealAmountInfoMapper;
import com.turboqiang.springbootmybatisplus.realamount.service.IDriverRealAmountInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 可提现金额刷入时的流水表 服务实现类
 * </p>
 *
 * @author turboqiang
 * @since 2021-09-04
 */
@Service
public class DriverRealAmountInfoServiceImpl extends ServiceImpl<DriverRealAmountInfoMapper, DriverRealAmountInfo> implements IDriverRealAmountInfoService {

}
