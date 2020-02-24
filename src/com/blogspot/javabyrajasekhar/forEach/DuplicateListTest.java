/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.javabyrajasekhar.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author LingaRao
 */
public class DuplicateListTest {

    @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
        List<Map<String, String>> listMap = new ArrayList() {
            {
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577984");
                    }

                    {
                        put("Name", "Linga");
                    }

                    {
                        put("City", "Hyderabad");
                    }
                });
            }

            {
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577985");
                    }

                    {
                        put("Name", "Linga1");
                    }

                    {
                        put("City", "Hyderabad1");
                    }
                });
            }

            {
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577986");
                    }

                    {
                        put("Name", "Linga2");
                    }

                    {
                        put("City", "Hyderabad2");
                    }
                });
            }

            {
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577987");
                    }

                    {
                        put("Name", "Linga3");
                    }

                    {
                        put("City", "Hyderabad3");
                    }
                });
            }

            {
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577987");
                    }

                    {
                        put("Name", "Linga4");
                    }

                    {
                        put("City", "Hyderabad4");
                    }
                });
            }
            
            {
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577987");
                    }

                    {
                        put("Name", "Linga5");
                    }

                    {
                        put("City", "Hyderabad6");
                    }
                });
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577987");
                    }

                    {
                        put("Name", "Linga5");
                    }

                    {
                        put("City", "Hyderabad6");
                    }
                });
                add(new HashMap() {
                    {
                        put("Mobile_No", "919652577984");
                    }

                    {
                        put("Name", "Linga");
                    }

                    {
                        put("City", "Hyderabad");
                    }
                });
            }
        };
        HashMap<String, Map<String, String>> hashMap = new HashMap<String,Map<String, String>>();
        HashMap<String, Map<String, String>> hashMap1 = new HashMap<String,Map<String, String>>();
        
//        if(null !=listMap && listMap.size()>0) {        	
//        	listMap.stream().filter(length->null !=length && length.size()>0).forEach(map->{
//        		List<Entry<String, String>> collect = map.entrySet().stream().filter(key->"Mobile_No".equals(key.getKey())).collect(Collectors.toList());
//        	 map.entrySet().stream().forEach(data->{
//        		 if(data.getKey().equals("Mobile_No")){
//        			 if(hashMap.containsKey(data.getValue())) {
//         				hashMap.put(data.getValue(), hashMap.get(data.getValue())+1);        			
//         			}else {
//         				hashMap.put(data.getValue(), 1);    
//         			}
//        		 }
//        	 });
        	 
        	 listMap.stream().filter(length->null !=length && length.size()>0).forEach(map1->{
        		 
        		 map1.entrySet().stream().forEach(data->{
            		 if(data.getKey().equals("Mobile_No")){
            			 if(hashMap.containsKey(data.getValue())) {
             				hashMap.put(data.getValue(), map1);
             				hashMap1.put(data.getValue(), map1);
             			}else {
             				hashMap.put(data.getValue(), map1);    
             			}
            		 }
            	 });
        	 });
        	 
        	 hashMap1.forEach((k,v)->System.out.println(k+"="+v));
        	 
//        		System.out.println(collect);
//        		collect.stream().forEach(val->{
//        			if(hashMap.containsKey(val.getValue())) {
//        				hashMap.put(val.getValue(), hashMap.get(val.getValue())+1);        			
//        			}else {
//        				hashMap.put(val.getValue(), 1);    
//        			}
//        		});
//        	});
        	
//        	hashMap.entrySet().stream().filter(mob->mob.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);
//        	List<String> duplicateMobilenumbersList = hashMap.entrySet().stream().filter(mob->mob.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
//        	System.out.println(duplicateMobilenumbersList);
        }
    }
       
    //}

    
