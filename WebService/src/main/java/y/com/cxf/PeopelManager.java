package y.com.cxf;

import y.com.bean.Peopel;
import y.com.bean.ResponseResult;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
@WebService
public interface PeopelManager {

    @WebMethod
    List<Peopel> queryPeopel();

    @WebMethod
    ResponseResult addPeopel(@WebParam(name = "peopel")Peopel peopel);
}
