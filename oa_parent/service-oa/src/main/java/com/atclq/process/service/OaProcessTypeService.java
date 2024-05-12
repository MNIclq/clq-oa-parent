package com.atclq.process.service;

import com.atclq.model.process.ProcessType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface OaProcessTypeService extends IService<ProcessType> {

    //查询所有审批分类和每个分类所有审批模板
    List<ProcessType> findProcessType();
}
