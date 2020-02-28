package y.com.cxf;

import y.com.bean.Peopel;
import y.com.bean.ResponseResult;

import java.util.ArrayList;
import java.util.List;

public class PeopelManagerImpl implements PeopelManager {
    @Override
    public List<Peopel> queryPeopel() {
        List<Peopel> peopels=new ArrayList<>();
        Peopel peopel=new Peopel();
        peopel.setId(1);
        peopel.setName("zhangsan");
        peopels.add(peopel);
        peopel=new Peopel();
        peopel.setId(2);
        peopel.setName("lisi");
        return peopels;
    }

    @Override
    public ResponseResult addPeopel(Peopel peopel) {
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(1);;
        responseResult.setMessage("成功");
        return responseResult;
    }


}
