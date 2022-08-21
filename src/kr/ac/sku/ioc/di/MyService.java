package kr.ac.sku.ioc.di;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class MyService {
    private String name;
    private int count;
    @Autowired
    private MyDAO myDao;
   public MyService(MyDAO myDao) {
       this.myDao = myDao;
   }
    public void checkPrint() {
        myDao.print();
    }
}
