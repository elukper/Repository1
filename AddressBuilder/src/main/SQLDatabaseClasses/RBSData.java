package main.SQLDatabaseClasses;

import java.lang.reflect.Array;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import main.UtilityClasses.DatabaseUtilityMySQL;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Store;




@Entity
@Table (name=DatabaseUtilityMySQL.RBSDATA_SQL_TABLENAME)
public class RBSData {
	
	//Constructors:
	public RBSData (String rbsName) {
		this.rbsName = rbsName;
	}
	
	public RBSData(){
		
	}
	
	public RBSData(String rbsName, int iubVID, int s1vid, int omVID,
			int abisVID, String tcuSIU, int tnAbisVID, int tnIubVID,
			int tnS1VID, int tnOMVID) {
		super();
		this.rbsName = rbsName;
		this.iubVID = iubVID;
		s1VID = s1vid;
		this.omVID = omVID;
		this.abisVID = abisVID;
		this.tcuSIU = tcuSIU;
		this.tnAbisVID = tnAbisVID;
		this.tnIubVID = tnIubVID;
		this.tnS1VID = tnS1VID;
		this.tnOMVID = tnOMVID;
	}

	public RBSData(String rbsName, int iubVID, int s1vid, int omVID,
			int abisVID, String tcuSIU, String peDevice) {
		super();
		this.rbsName = rbsName;
		this.iubVID = iubVID;
		s1VID = s1vid;
		this.omVID = omVID;
		this.abisVID = abisVID;
		this.tcuSIU = tcuSIU;
		this.peDevice = peDevice;
	}

	//Variables:
	private String rbsName;
	private int iubVID;
	private int s1VID;
	private int omVID;
	private int abisVID;
	private String tcuSIU;
	private int tnAbisVID;
	private int tnIubVID;
	private int tnS1VID;
	private int tnOMVID;
	private String peDevice;
	
	//Getters and setters:
	@Id
	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_RBSNAME_COLUMN)
	public String getRbsName() {
		return rbsName;
	}

	public void setRbsName(String rbsName) {
		this.rbsName = rbsName;
	}
	
	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_IUB_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getIubVID() {
		return iubVID;
	}

	public void setIubVID(int iubVID) {
		this.iubVID = iubVID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_S1_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getS1VID() {
		return s1VID;
	}

	public void setS1VID(int s1vid) {
		s1VID = s1vid;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_OM_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getOmVID() {
		return omVID;
	}

	public void setOmVID(int omVID) {
		this.omVID = omVID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_ABIS_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getAbisVID() {
		return abisVID;
	}

	public void setAbisVID(int abisVID) {
		this.abisVID = abisVID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_SIU_TCU_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public String getTcuSIU() {
		return tcuSIU;
	}

	public void setTcuSIU(String tcuSIU) {
		this.tcuSIU = tcuSIU;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_TN_ABIS_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getTnAbisVID() {
		return tnAbisVID;
	}

	public void setTnAbisVID(int tnAbisVID) {
		this.tnAbisVID = tnAbisVID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_TN_IUB_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getTnIubVID() {
		return tnIubVID;
	}

	public void setTnIubVID(int tnIubVID) {
		this.tnIubVID = tnIubVID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_TN_S1_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getTnS1VID() {
		return tnS1VID;
	}

	public void setTnS1VID(int tnS1VID) {
		this.tnS1VID = tnS1VID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_TN_OM_VID_COLUMN)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public int getTnOMVID() {
		return tnOMVID;
	}

	public void setTnOMVID(int tnOMVID) {
		this.tnOMVID = tnOMVID;
	}

	@Column(name=DatabaseUtilityMySQL.RBSDATA_SQL_PE_DEVICE)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	public String getPeDevice() {
		return peDevice;
	}

	public void setPeDevice(String peDevice) {
		this.peDevice = peDevice;
	}
	
	//Additional methods
	
	public int getSpecificVid(String tableName){
		
		switch (tableName) {
		
		case DatabaseUtilityMySQL.RBSSUBNETDATA_SQL_TABLENAME_ABIS: return getAbisVID();
		case DatabaseUtilityMySQL.RBSSUBNETDATA_SQL_TABLENAME_IUB: return getIubVID(); 
		case DatabaseUtilityMySQL.RBSSUBNETDATA_SQL_TABLENAME_OM: return getOmVID(); 
		case DatabaseUtilityMySQL.RBSSUBNETDATA_SQL_TABLENAME_S1: return getS1VID();
		default: return 0;
		
		}
		
	}
	
	

	

}



