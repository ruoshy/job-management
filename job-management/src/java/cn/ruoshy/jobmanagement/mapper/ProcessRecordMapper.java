package cn.ruoshy.jobmanagement.mapper;

import cn.ruoshy.jobmanagement.entity.ProcessRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProcessRecordMapper {

    ProcessRecord findByScheduleId(Integer scheduleId);

    Integer insert(ProcessRecord processRecord);

    Integer update(ProcessRecord processRecord);

}
