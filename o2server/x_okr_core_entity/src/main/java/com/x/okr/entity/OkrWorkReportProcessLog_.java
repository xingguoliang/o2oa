/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrWorkReportProcessLog.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:40:52 CST 2018")
public class OkrWorkReportProcessLog_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> activityName;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,Date> arriveTime;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> arriveTimeStr;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> centerId;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> centerTitle;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> decision;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> id;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> opinion;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,Integer> processLevel;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> processStatus;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,Date> processTime;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> processTimeStr;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> processorIdentity;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> processorName;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> processorTopUnitName;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> processorUnitName;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> reportTitle;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> status;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,Long> stayTime;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> title;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> workId;
    public static volatile SingularAttribute<OkrWorkReportProcessLog,String> workReportId;
}
