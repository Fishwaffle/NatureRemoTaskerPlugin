/*
 * Copyright (c) 2018 FishWaffle.
 */

package com.fishwaffle.natureremo.controller;


import com.fishwaffle.natureremo.controller.models.Appliance;
import com.fishwaffle.natureremo.controller.models.Device;
import com.fishwaffle.natureremo.controller.models.Signal;
import com.fishwaffle.natureremo.controller.models.User;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;


public class GetRequestUnitTest {
    /**
     * 下記でアクセストークンを取得して設定する
     * https://home.nature.global/
     */
    static final String TOKEN = "";
    @Test
    public void Users_Me_Get() {
        final User data = NatureRemo.Users_Me_Get(TOKEN);
        System.out.println(data);
        assertNotNull(data);
    }

    @Test
    public void Devices_Get() {
        final Device[] data = NatureRemo.Devices_Get(TOKEN);
        System.out.println(Arrays.toString(data));
        assertNotNull(data);
    }

    @Test
    public void Appliances_Get() {
        final Appliance[] data = NatureRemo.Appliances_Get(TOKEN);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(data[0].GetSignals(TOKEN)));
        assertNotNull(data);
    }

    @Test
    public void Appliances_Signals_Get() {
        final Signal[] data = NatureRemo.Appliances_Appliance_Signals_Get(TOKEN,"7735a677-3c91-4b42-80f9-9fad34db4b17");
        System.out.println(Arrays.toString(data));
        assertNotNull(data);
    }




}