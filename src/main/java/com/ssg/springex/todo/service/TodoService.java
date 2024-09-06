package com.ssg.springex.todo.service;

import com.ssg.springex.todo.dao.TodoDAO;
import com.ssg.springex.todo.domain.TodoVO;
import com.ssg.springex.todo.dto.TodoDTO;
import com.ssg.springex.todo.util.ModelUtil;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;
    private TodoDAO dao;
    private ModelMapper modelMapper;
    TodoService(){
        dao = new TodoDAO(); // 직접 dao 주입
        modelMapper = ModelUtil.INSTANCE.get();
    }

    public void register(TodoDTO dto) throws Exception{
        TodoVO vo = modelMapper.map(dto, TodoVO.class); // dto를 vo로 바로 싸악~ 바꿔줌
        System.out.println("todoVo : " + vo);
        dao.insert(vo); //int 반환하므로 예외처리는 후에 진행
    }

//    //글 하나를 등록하는 기능
//    public  void register(TodoDTO dto){
//        System.out.println("DEBUG..........." + dto);
//    }
//
//
//    //등록된 글 목록 반환하는 기능   10개의 TodoDTO (글) 을 만들어서 리스트 객체로 반환
//    public List<TodoDTO> getList(){
//
//        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i->{
//
//             TodoDTO dto = new TodoDTO();
//             dto.setTno((long)i);
//             dto.setTitle("Todo...."+i);
//             dto.setDueDate(LocalDate.now());
//             return dto;
//
//        }).collect(Collectors.toList());
//                       return todoDTOS;
//    }
//
//    public TodoDTO get(Long tno){
//        TodoDTO dto = new TodoDTO();
//        dto.setTno(tno);
//        dto.setTitle("Sample Todo");
//        dto.setDueDate(LocalDate.now());
//        dto.setFinished(true);
//
//        return dto;
//
//
//
//    }

}


