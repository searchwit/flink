package test.ctrx.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by e06836 on 9/30/17.
 */
public abstract class BaseImpl
        implements Comparable, Serializable
{
    private static final long serialVersionUID = 1L;
    public static final String STATUS_STATUS = "status";
    public static final String STATUS_ACTIVE = "active";
    public static final String STATUS_DELETED = "deleted";
    public static final String STATUS_CREATED = "created";
    public static final String STATUS_NOCHANGE = "nochange";
    public static final String STATUS_UPDATE = "update";

    public static final SimpleDateFormat SDF_LONG = new SimpleDateFormat("EEE, MMM dd, yyyy @ HH:mm z");
    public static final SimpleDateFormat SDF_SHORT = new SimpleDateFormat("yyyyMMdd");
    public static final SimpleDateFormat SDF_MEDIUM = new SimpleDateFormat("EEE, MMM dd, yyyy");
    public static final SimpleDateFormat SDF_MEDIUM2 = new SimpleDateFormat("MMM dd, yyyy");
    public static final SimpleDateFormat TIMEZONE_LONG_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzz");
    //TIMEZONE_LONG_SDF..setTimeZone(TimeZone.getTimeZone("GMT"));

    public static final SimpleDateFormat RPT_LONG_SDF = TIMEZONE_LONG_SDF; //new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    public static final Splitter CQL_SPLITTER = Splitter.on(';').trimResults().omitEmptyStrings();
    public static final Splitter LINE_SPLITTER = Splitter.on('\n').trimResults().omitEmptyStrings();
    public static final Splitter COMMA_SPLITTER = Splitter.on(',').trimResults().omitEmptyStrings();
    public static final Splitter PIPE_SPLITTER = Splitter.on('|').trimResults().omitEmptyStrings();

    public static final Splitter SPACE_SPLITTER = Splitter.on(' ').trimResults().omitEmptyStrings();

    public static final Joiner CQL_JOINER = Joiner.on("; ").useForNull(",");
    public static final Joiner SPACE_JOINER = Joiner.on(" ").skipNulls();
    public static final Joiner DASH_JOINER = Joiner.on("-").skipNulls();
    public static final Joiner PIPE_JOINER = Joiner.on("|").skipNulls();
    public static final Joiner COMMA_JOINER = Joiner.on(", ").skipNulls();
    public static final Joiner LINE_JOINER = Joiner.on("\n").skipNulls();

    @JsonProperty("uid")
    public abstract String getUid();

    protected Integer requestId;   //userId
    protected String uid;
    protected String query;
    protected int startRow = 1;
    protected int pageSize = 20;
    protected String sortField;
    protected String sortOrder;

    //add dec 21, to pass by from previous search
    protected long totalRow;

    public String[] getRow()
    {
        return new String[0];
    }

    protected void update(BaseImpl other)
    {

    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }


    @JsonProperty
    public long getTotalRow()
    {
        return totalRow;
    }

    public void setTotalRow(long totalRow)
    {
        this.totalRow = totalRow;
    }

    @JsonProperty
    public String getQuery()
    {
        return query;
    }

    public void setQuery(String query)
    {
        this.query = query;
    }

    @JsonProperty
    public int getStartRow()
    {
        return startRow;
    }

    public void setStartRow(int startRow)
    {
        this.startRow = startRow;
    }

    @JsonProperty
    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    @JsonProperty
    public String getSortField()
    {
        return sortField;
    }

    public void setSortField(String sortField)
    {
        this.sortField = sortField;
    }

    @JsonProperty
    public String getSortOrder()
    {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder)
    {
        this.sortOrder = sortOrder;
    }

    /**
     * track the changes, key:field name: values old and new value
     */
    protected HashMap<String, Object[]> changes = new HashMap<String, Object[]>();

    protected String status = null;

    //add 07/29/2009
    public HashMap<String, Object[]> getChanges()
    {
        return changes;
    }

    @JsonProperty("requestId")
    public Integer getRequestId()
    {
        return requestId;
    }

    public void setRequestId(Integer requestId)
    {
        this.requestId = requestId;
    }

    /**
     * put the delete code in the status
     */
    public void delete()
    {
        this.changes.clear();
        //        this.changes.put("status", new String[]{"active", "delete"});
        this.changes.put(STATUS_STATUS, new String[] {STATUS_ACTIVE, STATUS_DELETED});

        setStatus(STATUS_DELETED); //"Deleted");
    }


    public String getStatus()
    {
        return status;
    }

    /**
     * see delete() function:
     * only status of deleted will be saved in the history table,
     * not the created
     */
    public void setStatus(String status)
    {
        //        status = StringUtil.trimToNull(status);
        //
        //        if (!Different.different(this.status, status)) return;

        this.status = status;

        //        this.changes.put("status", new String[]{this.status, status});
    }

    public boolean equals(Object obj)
    {

        if (this == obj) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        return Objects.equals(this.getUid(), ((BaseImpl) obj).getUid());
    }

    /**
     * Make a hash code that reflects the equals() logic as well.
     * We want two objects, even if different instances,
     * if they have the same id to hash the same.
     */
    public int hashCode()
    {
//        String id = (String) this.getId();
//        return id == null ? "null".hashCode() : id.hashCode();
        return Objects.hash(getUid());
    } // hashCode

    /**
     * Compare this object with the specified object for order.
     *
     * @return A negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     */
    public int compareTo(Object obj)
    {
        if (!(obj instanceof BaseImpl)) {
            throw new ClassCastException();
        }

        // if the object are the same, say so
        if (obj == this) {
            return 0;
        }

        // sort based on (unique) id
        int compare = getUid().compareTo(((BaseImpl) obj).getUid());

        return compare;
    } // compareTo

    /**
     * Clear the changed flag(s).
     */
    public void clearChanged()
    {
//        this.changed.clearChanged();
        this.changes.clear();
        this.setStatus(null);
    }
    //added end here
////used only by those sar related impl. files.
//protected String getVals(boolean[] choices, String[] vals) {
//StringBuffer sb = new StringBuffer();
//for(int i=0; i<choices.length; i++) {
//if(choices[i]){
//sb.append(vals[i]);
//}
//}
//return sb.toString();
//}
//
//protected String getOneVal(boolean[] choices, String[] vals) {
////StringBuffer sb = new StringBuffer();
//for(int i=0; i<choices.length; i++) {
//if(choices[i]){
//return vals[i];
////sb.append(vals[i]);
//}
//}
//return "";
//}
//    private int start;
//    private int count;
//    private String query;
//
//    @JsonProperty
//    // @NotNull(message = "is missing")
//    public int getStart()
//    {
//        return start;
//    }
//
//    @JsonProperty
//    // @NotNull(message = "is missing")
//    public int getCount()
//    {
//        return count;
//    }
//
//    @JsonProperty
//    // @NotNull(message = "is missing")
//    public String getQuery()
//    {
//        return query;
//    }
//
//    public void setStart(int start)
//    {
//        this.start = start;
//    }
//
//    public void setCount(int count)
//    {
//        this.count = count;
//    }
//
//    public void setQuery(String query)
//    {
//        this.query = query;
//    }
//
//    @JsonProperty("uri")
//    public abstract String getUri();

//    public abstract void setUri(String uri);
}
