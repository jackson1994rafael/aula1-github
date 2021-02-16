package program;
import entities.num.OrderStatus;
import java.util.Date;


public class controle {
   private int id;
   private Date data;
   private OrderStatus status;

   public controle(){       
   }
   public controle(int id, Date data,OrderStatus status){
       this.id=id;
       this.data=data;
       this.status=status;
   }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the status
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "controle{" + "id=" + id + ", data=" + data + ", status=" + status + '}';
    }
    
}

