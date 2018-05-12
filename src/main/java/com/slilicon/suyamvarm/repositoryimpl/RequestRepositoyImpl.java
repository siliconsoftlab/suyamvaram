package com.slilicon.suyamvarm.repositoryimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.mongodb.client.result.UpdateResult;
import com.slilicon.suyamvarm.UserCollection;
import com.slilicon.suyamvarm.controller.SuyamvaramRestController;
import com.slilicon.suyamvarm.domain.Request;
import com.slilicon.suyamvarm.domain.User;
import com.slilicon.suyamvarm.repository.RequestRepository;

@Repository
public class RequestRepositoyImpl implements RequestRepository {
	private static final Logger logger = LoggerFactory.getLogger(SuyamvaramRestController.class);
	@Autowired
	UserCollection userCollection;
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public String newRequest(User user, Request request) {
		Optional<User> rsltUser = userCollection.findById(user.getId());
		if (rsltUser.isPresent()) {
			logger.info("**************************************");
			logger.info("********** User Id" + user.getId() + " Request " + request.toString());
			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(user.getId()));
			Update update = new Update();
			update.addToSet("outgoingRequest", request);
			mongoTemplate.updateFirst(query, update, User.class);
			logger.info("#######################################");

			/*
			 * Criteria criteria = new Criteria();
			 * criteria.orOperator(Criteria.where("id").is(user.getId()),Criteria.where(
			 * "outgoingRequest._id").is("11")); Query query1= new Query();
			 * query1.addCriteria(criteria); Update update1=new Update();
			 * update1.set("outgoingRequest.$.status", "Modified"); UpdateResult mm=
			 * mongoTemplate.updateFirst(query1, update1, User.class); if(
			 * mm.isModifiedCountAvailable()) { mm.getModifiedCount();
			 * logger.info("---------------------- "+mm.getModifiedCount()); }
			 */

			return "Present";

		} else {
			return "Not Present";
		}
	}

	@Override
	public String updateRequest(User user, Request request) {
		
		Criteria criteria = new Criteria();
		criteria.andOperator(Criteria.where("id").is(user.getId()),Criteria.where("outgoingRequest._id").is(request.getId()));
		
		/*UpdateResult wr = mongoTemplate.updateFirst(new Query(Criteria.where("outgoingRequest._id").is("Ranni")),
				new Update().set("outgoingRequest.$.status", request.getStatus()), User.class);
		*/
		
		UpdateResult wr = mongoTemplate.updateFirst(new Query(criteria),
				new Update().set("outgoingRequest.$.status", request.getStatus()), User.class);
		
		return null;
	}

}
