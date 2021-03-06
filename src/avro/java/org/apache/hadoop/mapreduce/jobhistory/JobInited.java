/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JobInited extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JobInited\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"launchTime\",\"type\":\"long\"},{\"name\":\"totalMaps\",\"type\":\"int\"},{\"name\":\"totalReduces\",\"type\":\"int\"},{\"name\":\"jobStatus\",\"type\":\"string\"},{\"name\":\"uberized\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence jobid;
  @Deprecated public long launchTime;
  @Deprecated public int totalMaps;
  @Deprecated public int totalReduces;
  @Deprecated public java.lang.CharSequence jobStatus;
  @Deprecated public boolean uberized;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public JobInited() {}

  /**
   * All-args constructor.
   */
  public JobInited(java.lang.CharSequence jobid, java.lang.Long launchTime, java.lang.Integer totalMaps, java.lang.Integer totalReduces, java.lang.CharSequence jobStatus, java.lang.Boolean uberized) {
    this.jobid = jobid;
    this.launchTime = launchTime;
    this.totalMaps = totalMaps;
    this.totalReduces = totalReduces;
    this.jobStatus = jobStatus;
    this.uberized = uberized;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return jobid;
    case 1: return launchTime;
    case 2: return totalMaps;
    case 3: return totalReduces;
    case 4: return jobStatus;
    case 5: return uberized;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: jobid = (java.lang.CharSequence)value$; break;
    case 1: launchTime = (java.lang.Long)value$; break;
    case 2: totalMaps = (java.lang.Integer)value$; break;
    case 3: totalReduces = (java.lang.Integer)value$; break;
    case 4: jobStatus = (java.lang.CharSequence)value$; break;
    case 5: uberized = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'jobid' field.
   */
  public java.lang.CharSequence getJobid() {
    return jobid;
  }

  /**
   * Sets the value of the 'jobid' field.
   * @param value the value to set.
   */
  public void setJobid(java.lang.CharSequence value) {
    this.jobid = value;
  }

  /**
   * Gets the value of the 'launchTime' field.
   */
  public java.lang.Long getLaunchTime() {
    return launchTime;
  }

  /**
   * Sets the value of the 'launchTime' field.
   * @param value the value to set.
   */
  public void setLaunchTime(java.lang.Long value) {
    this.launchTime = value;
  }

  /**
   * Gets the value of the 'totalMaps' field.
   */
  public java.lang.Integer getTotalMaps() {
    return totalMaps;
  }

  /**
   * Sets the value of the 'totalMaps' field.
   * @param value the value to set.
   */
  public void setTotalMaps(java.lang.Integer value) {
    this.totalMaps = value;
  }

  /**
   * Gets the value of the 'totalReduces' field.
   */
  public java.lang.Integer getTotalReduces() {
    return totalReduces;
  }

  /**
   * Sets the value of the 'totalReduces' field.
   * @param value the value to set.
   */
  public void setTotalReduces(java.lang.Integer value) {
    this.totalReduces = value;
  }

  /**
   * Gets the value of the 'jobStatus' field.
   */
  public java.lang.CharSequence getJobStatus() {
    return jobStatus;
  }

  /**
   * Sets the value of the 'jobStatus' field.
   * @param value the value to set.
   */
  public void setJobStatus(java.lang.CharSequence value) {
    this.jobStatus = value;
  }

  /**
   * Gets the value of the 'uberized' field.
   */
  public java.lang.Boolean getUberized() {
    return uberized;
  }

  /**
   * Sets the value of the 'uberized' field.
   * @param value the value to set.
   */
  public void setUberized(java.lang.Boolean value) {
    this.uberized = value;
  }

  /** Creates a new JobInited RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder();
  }
  
  /** Creates a new JobInited RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder(other);
  }
  
  /** Creates a new JobInited RecordBuilder by copying an existing JobInited instance */
  public static org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JobInited other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder(other);
  }
  
  /**
   * RecordBuilder for JobInited instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JobInited>
    implements org.apache.avro.data.RecordBuilder<JobInited> {

    private java.lang.CharSequence jobid;
    private long launchTime;
    private int totalMaps;
    private int totalReduces;
    private java.lang.CharSequence jobStatus;
    private boolean uberized;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.JobInited.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.jobid)) {
        this.jobid = data().deepCopy(fields()[0].schema(), other.jobid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.launchTime)) {
        this.launchTime = data().deepCopy(fields()[1].schema(), other.launchTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.totalMaps)) {
        this.totalMaps = data().deepCopy(fields()[2].schema(), other.totalMaps);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.totalReduces)) {
        this.totalReduces = data().deepCopy(fields()[3].schema(), other.totalReduces);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.jobStatus)) {
        this.jobStatus = data().deepCopy(fields()[4].schema(), other.jobStatus);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uberized)) {
        this.uberized = data().deepCopy(fields()[5].schema(), other.uberized);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing JobInited instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JobInited other) {
            super(org.apache.hadoop.mapreduce.jobhistory.JobInited.SCHEMA$);
      if (isValidValue(fields()[0], other.jobid)) {
        this.jobid = data().deepCopy(fields()[0].schema(), other.jobid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.launchTime)) {
        this.launchTime = data().deepCopy(fields()[1].schema(), other.launchTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.totalMaps)) {
        this.totalMaps = data().deepCopy(fields()[2].schema(), other.totalMaps);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.totalReduces)) {
        this.totalReduces = data().deepCopy(fields()[3].schema(), other.totalReduces);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.jobStatus)) {
        this.jobStatus = data().deepCopy(fields()[4].schema(), other.jobStatus);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uberized)) {
        this.uberized = data().deepCopy(fields()[5].schema(), other.uberized);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'jobid' field */
    public java.lang.CharSequence getJobid() {
      return jobid;
    }
    
    /** Sets the value of the 'jobid' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder setJobid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.jobid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'jobid' field has been set */
    public boolean hasJobid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'jobid' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder clearJobid() {
      jobid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'launchTime' field */
    public java.lang.Long getLaunchTime() {
      return launchTime;
    }
    
    /** Sets the value of the 'launchTime' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder setLaunchTime(long value) {
      validate(fields()[1], value);
      this.launchTime = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'launchTime' field has been set */
    public boolean hasLaunchTime() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'launchTime' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder clearLaunchTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'totalMaps' field */
    public java.lang.Integer getTotalMaps() {
      return totalMaps;
    }
    
    /** Sets the value of the 'totalMaps' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder setTotalMaps(int value) {
      validate(fields()[2], value);
      this.totalMaps = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'totalMaps' field has been set */
    public boolean hasTotalMaps() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'totalMaps' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder clearTotalMaps() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'totalReduces' field */
    public java.lang.Integer getTotalReduces() {
      return totalReduces;
    }
    
    /** Sets the value of the 'totalReduces' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder setTotalReduces(int value) {
      validate(fields()[3], value);
      this.totalReduces = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'totalReduces' field has been set */
    public boolean hasTotalReduces() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'totalReduces' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder clearTotalReduces() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'jobStatus' field */
    public java.lang.CharSequence getJobStatus() {
      return jobStatus;
    }
    
    /** Sets the value of the 'jobStatus' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder setJobStatus(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.jobStatus = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'jobStatus' field has been set */
    public boolean hasJobStatus() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'jobStatus' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder clearJobStatus() {
      jobStatus = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'uberized' field */
    public java.lang.Boolean getUberized() {
      return uberized;
    }
    
    /** Sets the value of the 'uberized' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder setUberized(boolean value) {
      validate(fields()[5], value);
      this.uberized = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'uberized' field has been set */
    public boolean hasUberized() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'uberized' field */
    public org.apache.hadoop.mapreduce.jobhistory.JobInited.Builder clearUberized() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public JobInited build() {
      try {
        JobInited record = new JobInited();
        record.jobid = fieldSetFlags()[0] ? this.jobid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.launchTime = fieldSetFlags()[1] ? this.launchTime : (java.lang.Long) defaultValue(fields()[1]);
        record.totalMaps = fieldSetFlags()[2] ? this.totalMaps : (java.lang.Integer) defaultValue(fields()[2]);
        record.totalReduces = fieldSetFlags()[3] ? this.totalReduces : (java.lang.Integer) defaultValue(fields()[3]);
        record.jobStatus = fieldSetFlags()[4] ? this.jobStatus : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.uberized = fieldSetFlags()[5] ? this.uberized : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
