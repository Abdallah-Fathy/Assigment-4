/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

/**
 *
 * @author DELL
 */
public class MemberFactory {
    public Staff desiredMember(String memberName){
        if (memberName==null){
            return null;
        }
        if(memberName.equalsIgnoreCase("teachingassistant")){
            return (Staff) new TeachingAssistant();
        }
        else if(memberName.equalsIgnoreCase("doctor")){
            return new Doctor();
        }
        return null;
        
    }
    
}
