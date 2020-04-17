package com.matt.templateQ.TemplateSpringBoot2.repo;

import com.matt.templateQ.TemplateSpringBoot2.model.Work_order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface repo_wo extends JpaRepository<Work_order,String>
{
    String xx ="verified";
    @Query(value = "select * from work_order x where x.status_pekerjaan ='"+xx+"'",nativeQuery = true)
    List<Work_order> findByVerified();

//    String xxx ="<> verified";
//    @Query(value = "select * from work_order  where status_pekerjaan ='"+xxx+"'",nativeQuery = true)
//    List<Work_order> findQ();

    String Q="SELECT * FROM cmms.work_order where status_pekerjaan <> 'End_Job' and status_pekerjaan <> 'Verified'   ";
    @Query(value = Q,nativeQuery = true)
    List<Work_order> findQ();

    String Qx="SELECT * FROM cmms.work_order where status_pekerjaan = 'End_Job' ";
    @Query(value = Qx,nativeQuery = true)
    List<Work_order> findX();

    String Q2="SELECT * FROM work_order where kode_asset = ?1";
    @Query(value =Q2 ,nativeQuery = true)
    List<Work_order> findbykode(String kode_spare_part);

}
