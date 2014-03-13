package com.badnotes.demo.ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by jun.wan on 14-3-13.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ITest {
        public String say(@WebParam(name = "name") String name);
}
