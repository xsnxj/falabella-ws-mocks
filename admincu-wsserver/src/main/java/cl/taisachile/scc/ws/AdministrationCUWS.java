package cl.taisachile.scc.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-07-13T14:37:30.962-04:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://ws.scc.taisachile.cl/", name = "AdministrationCUWS")
@XmlSeeAlso({ObjectFactory.class})
public interface AdministrationCUWS {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "validateSecurityCode", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ValidateSecurityCode")
    @WebMethod
    @ResponseWrapper(localName = "validateSecurityCodeResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ValidateSecurityCodeResponse")
    public cl.taisachile.scc.ws.ValidateSecurityCodeResponseVO validateSecurityCode(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.ValidateSecurityCodeParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "changeLevelSecurity", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ChangeLevelSecurity")
    @WebMethod
    @ResponseWrapper(localName = "changeLevelSecurityResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ChangeLevelSecurityResponse")
    public cl.taisachile.scc.ws.ChangeLevelSecurityResponseVO changeLevelSecurity(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.ChangeLevelSecurityParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "changePassword", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ChangePassword")
    @WebMethod
    @ResponseWrapper(localName = "changePasswordResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ChangePasswordResponse")
    public cl.taisachile.scc.ws.ChangePasswordResponseVO changePassword(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.ChangePasswordParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.CreateUser")
    @WebMethod
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.CreateUserResponse")
    public cl.taisachile.scc.ws.CreateUserResponseVO createUser(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.CreateUserParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "validateChangePasswordSecurityCode", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ValidateChangePasswordSecurityCode")
    @WebMethod
    @ResponseWrapper(localName = "validateChangePasswordSecurityCodeResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeResponse")
    public cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeResponseVO validateChangePasswordSecurityCode(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.ValidateChangePasswordSecurityCodeParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deleteUserCU", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.DeleteUserCU")
    @WebMethod
    @ResponseWrapper(localName = "deleteUserCUResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.DeleteUserCUResponse")
    public cl.taisachile.scc.ws.DeleteUserCUResponseVO deleteUserCU(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.DeleteUserCUParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "lockUserByDevice", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.LockUserByDevice")
    @WebMethod
    @ResponseWrapper(localName = "lockUserByDeviceResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.LockUserByDeviceResponse")
    public cl.taisachile.scc.ws.LockUserResponseVO lockUserByDevice(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.LockUserParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "existChangePasswordSecurityCodeCurrent", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ExistChangePasswordSecurityCodeCurrent")
    @WebMethod
    @ResponseWrapper(localName = "existChangePasswordSecurityCodeCurrentResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.ExistChangePasswordSecurityCodeCurrentResponse")
    public cl.taisachile.scc.ws.ExistActivationCodeCurrentResponseVO existChangePasswordSecurityCodeCurrent(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.ExistActivationCodeCurrentParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "generateChangePasswordSecurityCode", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GenerateChangePasswordSecurityCode")
    @WebMethod
    @ResponseWrapper(localName = "generateChangePasswordSecurityCodeResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GenerateChangePasswordSecurityCodeResponse")
    public cl.taisachile.scc.ws.GenerateChangePasswordSecurityCodeResponseVO generateChangePasswordSecurityCode(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.GenerateChangePasswordSecurityCodeParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getUserCU", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetUserCU")
    @WebMethod
    @ResponseWrapper(localName = "getUserCUResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetUserCUResponse")
    public cl.taisachile.scc.ws.GetUserCUResponseVO getUserCU(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.GetUserCUParamVO params
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getGenericOptions", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetGenericOptions")
    @WebMethod
    @ResponseWrapper(localName = "getGenericOptionsResponse", targetNamespace = "http://ws.scc.taisachile.cl/", className = "cl.taisachile.scc.ws.GetGenericOptionsResponse")
    public cl.taisachile.scc.ws.GetGenericOptionsResponseVO getGenericOptions(
        @WebParam(name = "params", targetNamespace = "")
        cl.taisachile.scc.ws.GetGenericOptionsParamVO params
    );
}
