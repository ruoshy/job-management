package cn.ruoshy.jobmanagement.mapper;

import cn.ruoshy.jobmanagement.entity.Schedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduleMapper {

    Schedule findById(Integer id);

    List<Schedule> findByName(String name);

    Integer insert(Schedule schedule);

    Integer update(Schedule schedule);

}
