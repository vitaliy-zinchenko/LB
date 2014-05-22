package zinchenko.dao;

import zinchenko.domain.Article;
import zinchenko.domain.Category;

import java.util.List;

/**
 * User: zinchenko
 * Date: 16.02.14
 */
public interface CategoryDao {

    List<Category> findAll();

    Category find(Long id);

    Long save(Category category);

    void update(Category category);

    void delete(Category category);

}
