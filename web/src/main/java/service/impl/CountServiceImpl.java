package service.impl;

import im.dubbo.service.CountService;
import org.springframework.stereotype.Service;

/**
 * Created by ldrs on 2015/4/27.
 */
@Service("countService")
public class CountServiceImpl implements CountService {
    private  int count = 0;
    @Override
    public int getCount(int i) {
        count++;
        int ij= i*count;

        System.out.println(ij);
        return ij;
    }
}
