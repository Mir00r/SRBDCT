package com.mir00r.reviewsolicitors;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author mir00r on 9/11/22
 * @project IntelliJ IDEA
 */
public class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    private final AlertDAO alertDao;

    public AlertService(AlertDAO alertDao) {
        this.alertDao = alertDao;
    }

    public UUID raiseAlert() {
        return this.alertDao.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.alertDao.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<>();

    @Override
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}

interface AlertDAO {

    UUID addAlert(Date time);

    Date getAlert(UUID id);
}


class Cache {}

class DiskCache extends Cache {}

class MemoryCache extends Cache {}

class OptimizedDiskCache extends DiskCache {}

class Test {

    MemoryCache memoryCache = new MemoryCache();
    Cache cache = memoryCache;
    DiskCache diskCache = (DiskCache) cache;

    DiskCache diskCache1 = new DiskCache();
    OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;

    Cache cache2 = new Cache();
    MemoryCache memoryCache1 = (MemoryCache) cache;
}


