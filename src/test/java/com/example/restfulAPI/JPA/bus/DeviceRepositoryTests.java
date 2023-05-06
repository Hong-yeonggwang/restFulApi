package com.example.restfulAPI.JPA.bus;

import com.example.restfulAPI.JPA.Entity.bus.Device;
import com.example.restfulAPI.JPA.Entity.bus.Location;
import com.example.restfulAPI.JPA.Repository.bus.DeviceRepository;
import com.example.restfulAPI.JPA.Repository.bus.LocationRepository;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.LocationAwareValueMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DeviceRepositoryTests {
    @Autowired
    private DeviceRepository  deviceRepository;
    @Autowired
    private LocationRepository locationRepository;
    @Test
    public void insetDeviceInfo(){
        Device device = new Device();
        device.setDeviceName("테스트디바이스1");
        device.setDeviceHashKey("테스트디바이스해쉬키");

        deviceRepository.save(device);

        List<Device> seletAll = deviceRepository.findAll();
        seletAll.forEach(name -> System.out.println(name.getDeviceName()));
    }

    @Test
    public void selectNowTime(){
        List<Location> nowBus = locationRepository.searchLocation();

        nowBus.forEach(obj->System.out.println(obj.getDeviceSeq().getDeviceName()));
        System.out.println(nowBus.size());
    }
}
