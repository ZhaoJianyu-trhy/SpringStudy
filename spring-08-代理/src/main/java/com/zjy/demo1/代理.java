package com.zjy.demo1;

public class 代理 implements 租房 {
    private 房东 host;

    public void 签合同() {
        System.out.println("与房客签订合同~~~");
    }

    public void 收中介费() {
        System.out.println("代理收中介费~~~");
    }

    public void 看房() {
        System.out.println("中介带你看房~~~");
    }

    public 代理(房东 host) {
        this.host = host;
    }

    public 代理() {
    }

    public void 租房() {
        看房();
        签合同();
        host.租房();
        收中介费();
    }
}
