����   4 A  it/polito/oop/vaccination/Day  java/lang/Object totHours I day slots Ljava/util/List; 	Signature $Ljava/util/List<Ljava/lang/String;>; mm <init> (II)V Code
     ()V  java/util/ArrayList
  	    		    	    	     LineNumberTable LocalVariableTable this Lit/polito/oop/vaccination/Day; setSlots $ 	%02d:%02d
 & ( ' java/lang/Integer ) * valueOf (I)Ljava/lang/Integer;
 , . - java/lang/String / 0 format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; 2 4 3 java/util/List 5 6 add (Ljava/lang/Object;)Z hh StackMapTable getSlots ()Ljava/util/List; &()Ljava/util/List<Ljava/lang/String;>; getDay ()I getTotHours 
SourceFile Day.java !                     	  
                   q     *� *� Y� � *� *� *� �             
                    !                "      �     �	<� �*� #� Y� %SY� %S� +� 1 W*� #� Y� %SY� %S� +� 1 W*� #� Y� %SY� %S� +� 1 W*� #� Y� %SY� %S� +� 1 W�	*� `��n�              '  I  k  �  �         �   !    � 7   8   	 � � �  9 :  
    ;    /     *� �                      !    < =     /     *� �           #           !    > =     /     *� �           '           !    ?    @