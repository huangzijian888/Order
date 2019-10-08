package cn.huangzijian888.order.config.security;

import lombok.Data;

/**
 * @author huangzijian888
 */
@Data
public class AjaxResponseBody {
    private Integer code;
    private Boolean success;
    private String msg;
    private Object data;

    public AjaxResponseBody() {
        this.data = null;
    }

    public AjaxResponseBody(Integer code, Boolean success, String msg) {
        this();
        this.code = code;
        this.success = success;
        this.msg = msg;
    }
}
