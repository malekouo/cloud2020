import com.atguigu.springcloud.PaymentMain8001;
import com.atguigu.springcloud.dao.PaymentMapper;
import com.atguigu.springcloud.entities.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PaymentMain8001.class)
public class PaymentTest {

    @Resource
    private PaymentMapper paymentMapper;

    @Test
    public void testAdd(){
        paymentMapper.save(new Payment(1L,"123"));
    }


}
