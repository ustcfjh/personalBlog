package com.jiahui.personalsite.Dao;

import com.jiahui.personalsite.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
