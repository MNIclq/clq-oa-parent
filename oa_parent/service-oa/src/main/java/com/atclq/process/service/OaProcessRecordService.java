package com.atclq.process.service;

import com.atclq.model.process.ProcessRecord;
import com.baomidou.mybatisplus.extension.service.IService;

public interface OaProcessRecordService extends IService<ProcessRecord> {

    void record(Long processId,Integer status,String description);
}
