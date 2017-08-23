package cn.zhku.amenity.utils.interfaceUtils;

import java.util.List;

/**
 * 提供基础接口
 *
 * @author 钱伟健 gonefutre
 * @date 2017/7/21 20:58.
 * @E-mail gonefuture@qq.com
 */
public interface IBaseService<T> {

    /**
     * 对某个实体对象（相对应的表）添加操作
     *
     * @param entity
     *            必须包含主键
     * @return 影响行数
     *
     */
    public int add(T entity) ;



    /**
     * 对某个实体对象（相对应的表）删除操作
     *
     * @param entity
     *            通过主键删除
     * @return 影响行数
     */
    public int delete(T entity);

    /**
     * 通过ID获取某个对象实体
     *
     * @param id
     *            主键ID
     * @return
     * @throws Exception
     */

    /**
     * 对某个实体对象（相对应的表）修改操作
     *
     * @param entity
     *            null的实体属性不会起作用
     * @return 影响行数
     *
     */
    public int update(T entity) ;

    /**
     * 通过ID获取某个对象实体
     *
     * @param entity
     *            主键ID
     * @return
     * */

    public T get(T entity) ;

    /**
     * 通过查询条件获取某个实体对象（相对应的表）列表操作
     *
     * @param entity
     *
     * @return 影响行数
     */
    public List<T> findList(T entity) ;


}
