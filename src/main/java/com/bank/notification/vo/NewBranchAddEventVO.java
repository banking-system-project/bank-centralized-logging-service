package com.bank.notification.vo;

public class NewBranchAddEventVO {
    private String message;
    private String status;
    private BranchNewDetailsOutputVO branchNewDetailsOutputVO;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BranchNewDetailsOutputVO getBranchNewDetailsOutputVO() {
        return branchNewDetailsOutputVO;
    }

    public void setBranchNewDetailsOutputVO(BranchNewDetailsOutputVO branchNewDetailsOutputVO) {
        this.branchNewDetailsOutputVO = branchNewDetailsOutputVO;
    }

    @Override
    public String toString() {
        return "NewBranchAddEventVO{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", branchNewDetailsOutputVO=" + branchNewDetailsOutputVO +
                '}';
    }
}
