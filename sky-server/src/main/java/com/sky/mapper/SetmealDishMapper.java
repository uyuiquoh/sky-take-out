package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {


    //select setmeal_id from setmeal_dish where dish_id in (1,2,3,4)
    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetMealDishIdsByDishIds(List<Long> dishIds);
}
