package ${projPackage}.entity;

import java.util.List;

/****
 * @Author:${Author}
 * @Description:分页返回值
 * @Date ${Date}
 *****/
public class PageResult<T> {
    private Long total;//总记录数
    private List<T> rows;//记录

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult() {
    }

    public List<T> getRows() {
        return rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
