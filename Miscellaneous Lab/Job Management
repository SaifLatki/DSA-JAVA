
import java.util.*;

public class JobManagement {
    public class DocumentInfo {
        String documentInfo;

        DocumentInfo(String documentInfo) {
            this.documentInfo=documentInfo;
        }
    }
  Queue<DocumentInfo> job=new ArrayDeque<DocumentInfo>();

    public void enqueueNewEmployee(String documentInfo){
        DocumentInfo newDoc=new DocumentInfo(documentInfo);
        job.add(newDoc);
    }
    public void dequeueTheFirstOne(){
        if(job.isEmpty()){
            System.out.println("No any Document");
        }
        DocumentInfo document=job.remove();
        System.out.println("Remaining:  "+document.documentInfo);
    }

    public void display(){
        for(DocumentInfo info : job){
            System.out.println(info.documentInfo);
        }
    }

    public void clearJobs(){
        job.clear();
        System.out.println("All jobs are cleared from Queue");
    }

    public static void main(String[] args) {
        JobManagement j=new JobManagement();
        j.enqueueNewEmployee("CV");
        j.enqueueNewEmployee("certificate");
        j.enqueueNewEmployee("inssurance");
        j.display();
        j.dequeueTheFirstOne();
        j.display();

    }
}
