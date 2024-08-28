
public boolean warmup_sleepin (boolean weekday, boolean vacation) {
    boolean result = false;
    
    if(!weekday || vacation )
        result = true;
    
    return result;
}