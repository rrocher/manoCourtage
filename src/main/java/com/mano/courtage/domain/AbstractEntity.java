package com.mano.courtage.domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.annotation.PreDestroy;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class AbstractEntity  implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ts_insert")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date tsInsert;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ts_update")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date tsUpdate;
    
    @Column(name = "ts_delete")
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    protected Date tsDelete;
    
    @JsonIgnore
    @JoinColumn(name = "id_user_delete", referencedColumnName = "id", nullable=true)
    @ManyToOne(optional = true)
    protected User idUserDelete;
    
    @JsonIgnore
    @JoinColumn(name = "id_user_update", referencedColumnName = "id", nullable=true)
    @ManyToOne(optional = true)
    protected User idUserUpdate;
    
    @JsonIgnore
    @JoinColumn(name = "id_user_insert", referencedColumnName = "id", nullable=true)
    @ManyToOne(optional = true)
    protected User idUserInsert;

    @PrePersist
     protected void onCreate() {
       tsInsert = new Date();
       tsUpdate = new Date();
       
     }

     @PreUpdate
     protected void onUpdate() {
       tsUpdate = new Date();
     }
     
     @PreDestroy
     protected void onDestroy() {
       tsDelete = new Date();
     }
    // initialisation
    public AbstractEntity build(int id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object entity) {
        String class1 = this.getClass().getName();
        String class2 = entity.getClass().getName();

        if (!class2.equals(class1)) {
            return false;
        }
        AbstractEntity other = (AbstractEntity) entity;
        return this.id == other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTsInsert() {
    	if (tsInsert != null)
    		return tsInsert.toString();
    	return "";
    }

    public void setTsInsert(Date tsInsert) {
        this.tsInsert = tsInsert;
    }

    public String getTsUpdate() {
    	if (tsUpdate != null)
    		return tsUpdate.toString();
        return "";
    }

    public void setTsUpdate(Date tsUpdate) {
        this.tsUpdate = tsUpdate;
    }

    public Date getTsDelete() {
        return tsDelete;
    }

    public void setTsDelete(Date tsDelete) {
        this.tsDelete = tsDelete;
    }

    public User getIdUserDelete() {
        return idUserDelete;
    }

    public void setIdUserDelete(User idUserDelete) {
        this.idUserDelete = idUserDelete;
    }

    public User getIdUserUpdate() {
        return idUserUpdate;
    }

    public void setIdUserUpdate(User idUserUpdate) {
        this.idUserUpdate = idUserUpdate;
    }

    public User getIdUserInsert() {
        return idUserInsert;
    }

    public void setIdUserInsert(User idUserInsert) {
        this.idUserInsert = idUserInsert;
    }
        
    
    @Override
    public String toString() {
        return "AbstractEntity{" + "id=" + id +'}';
    }
}
