package cgq.service;

import cgq.pojo.Books;


import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //查找一本书
    Books queryBookById(int id);
    //修改一本书
    int updateBook(Books books);
    //查询全部的书
    List<Books> queryAllBook();
}
