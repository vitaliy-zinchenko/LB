package zinchenko.dao;

import zinchenko.domain.Article;
import zinchenko.domain.Group;

import java.util.List;

/**
 * User: zinchenko
 * Date: 16.02.14
 */
public interface GroupDao {

    List<Group> findAll();

    Group find(Long id);

    Long save(Group group);

    void update(Group group);

    void delete(Group group);

}
