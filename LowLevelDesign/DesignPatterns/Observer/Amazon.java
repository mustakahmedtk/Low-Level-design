package com.collection.LowLevelDesign.designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private List<OrderCancelledSubscriber> orderCancelledSubscribers;
    private static Amazon instance;
    private Amazon(){
        this.orderPlacedSubscribers = new ArrayList<OrderPlacedSubscriber>();
        this.orderCancelledSubscribers = new ArrayList<OrderCancelledSubscriber>();
    }

    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterSubsriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        this.orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    public void deRegisterOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        this.orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }
    }

    public void orderCancelled(){
        for(OrderCancelledSubscriber orderCancelledSubscriber : orderCancelledSubscribers){
            orderCancelledSubscriber.orderCancelledEvent();
        }
    }



}
