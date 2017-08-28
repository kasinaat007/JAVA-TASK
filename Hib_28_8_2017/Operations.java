package com.kasinaat007.operations;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.kasinaat007.config.Config;
import com.kasinaat007.stock.Item;

public class Operations {
	public static void insert(Item item) {
		Session session = Config.getConfig();
		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();
		session.close();
	}

	public static Item view(Integer id) {
		Session session = Config.getConfig();
		session.beginTransaction();
		Item returnedItem = session.get(Item.class, id);
		session.getTransaction().commit();
		session.close();
		return returnedItem;
	}

	public static void delete(Integer id) {
		Session session = Config.getConfig();
		session.beginTransaction();
		Query query = session.createQuery("DELETE from Item where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

	public static void update(Integer id, Item item) {
		delete(id);
		insert(item);
	}

	@SuppressWarnings("unchecked")
	public static List<Item> viewAll() {
		Session session = Config.getConfig();
		List<Item> list = new LinkedList<Item>();
		Query query = session.createQuery("from Item");
		list = query.getResultList();
		return list;

	}
}
