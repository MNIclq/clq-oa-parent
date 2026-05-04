package com.atclq.auth.service.impl;

import com.atclq.auth.mapper.SysPostMapper;
import com.atclq.auth.service.SysPostService;
import com.atclq.model.system.SysPost;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysPostServiceImpl extends ServiceImpl<SysPostMapper, SysPost> implements SysPostService {
}
