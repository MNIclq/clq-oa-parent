package com.atclq.auth.service.impl;

import com.atclq.auth.mapper.SysDeptMapper;
import com.atclq.auth.service.SysDeptService;
import com.atclq.model.system.SysDept;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService {
}
